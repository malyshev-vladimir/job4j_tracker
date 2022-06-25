package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The class describes the operation of a banking server.
 * @author Vladimir Malyshev
 * @version 1.0
 */
public class BankService {
    /**
     * The Map contains keys to values. Keys are the users (objects of class User) and values are ArrayList<Account>
     *     of user's accounts.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * The method adds users in HashMap "users".
     * @param user user (objects of class User)
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * The method adds a previously non-existent account to a user with this passport number.
     * @param passport user's passport number
     * @param account account (object of class Account) with a requisite and a balance
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }

    }

    /**
     * The method finds the required user by passport number.
     * @param passport user's passport number
     * @return user with the given passport number.
     */
    public User findByPassport(String passport) {
        User result = null;
        for (User key : users.keySet()) {
            if (passport.equals(key.getPassport())) {
                result = key;
                break;
            }
        }
        return result;
    }

    /**
     * The method finds the required account by the user's passport number and account requisite.
     * @param passport user's passport number
     * @param requisite user's account requisite
     * @return user's account with the given requisites. If account don't found by the specified parameters,
     * the method returns "null".
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * The method allows transferring money from the bank account of one user to the bank account of another user.
     * @param srcPassport sender's passport number
     * @param srcRequisite sender account requisite
     * @param destPassport recipient's passport number
     * @param destRequisite recipient's account requisite
     * @param amount amount of money sent
     * @return "true", if the transfer succeeded, and "false", if the transfer failed.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount && destAccount != null) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}