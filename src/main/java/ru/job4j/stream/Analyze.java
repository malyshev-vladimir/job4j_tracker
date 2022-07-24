package ru.job4j.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(subject -> subject.score())
                .average()
                .orElse(0);
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), Analyze.averageScore(Stream.of(pupil))))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(s -> s.name(), LinkedHashMap::new, Collectors.averagingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(object -> new Tuple(object.getKey(), object.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.name(), pupil.subjects()
                        .stream()
                        .mapToInt(subject -> subject.score())
                        .sum()))
                .max(Comparator.comparingDouble(tuple -> tuple.score()))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(subject -> subject.name(), Collectors.summarizingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(o -> new Tuple(o.getKey(), o.getValue().getSum()))
                .max(Comparator.comparingDouble(tuple -> tuple.score()))
                .orElse(null);
    }
}