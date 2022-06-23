package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmpAscByName = new JobAscByName();
        int rsl = cmpAscByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescByName = new JobDescByName();
        int rsl = cmpDescByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmpAscByPriority = new JobAscByPriority();
        int rsl = cmpAscByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescByPriority = new JobDescByPriority();
        int rsl = cmpDescByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndThenAscByPriority() {
        Comparator<Job> cmpAscNameAscPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscNameAscPriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndThenDescByPriority() {
        Comparator<Job> cmpAscNameDescPriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpAscNameDescPriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDecsByNameAndThenAscByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndThenDescByPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByPriorityAndThenAscByName() {
        Comparator<Job> cmpAscPriorityAscName = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpAscPriorityAscName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByPriorityAndThenAscByName() {
        Comparator<Job> cmpDescPriorityAscName = new JobDescByPriority().thenComparing(new JobAscByName());
        int rsl = cmpDescPriorityAscName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByPriorityAndThenDescByName() {
        Comparator<Job> cmpAscPriorityDescName = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmpAscPriorityDescName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByPriorityAndThenDescByName() {
        Comparator<Job> cmpDescPriorityDescName = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpDescPriorityDescName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}