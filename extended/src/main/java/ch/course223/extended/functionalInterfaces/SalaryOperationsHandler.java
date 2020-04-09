package ch.course223.extended.functionalInterfaces;

import ch.course223.extended.domainModels.User;
import ch.course223.extended.functionalInterfaces.SalaryOperationMultipleResults;
import ch.course223.extended.functionalInterfaces.SalaryOperationSingleResult;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryOperationsHandler {
    SalaryOperationSingleResult bestEarningUser = (List<User> users) -> users.stream().sorted(Comparator.comparing(User::getSalary).reversed()).findFirst();
    SalaryOperationSingleResult worstEarningUser = (List<User> users) -> users.stream().sorted(Comparator.comparing(User::getSalary)).findFirst();

    SalaryOperationMultipleResults allUsersEarningMoreThan2000 = (List<User> users) -> users.stream().filter(user -> user.getSalary() > 2000).collect(Collectors.toList());
    SalaryOperationMultipleResults allUsersEarningLessThan2000 = (List<User> users) -> users.stream().filter(user -> user.getSalary() < 2000).collect(Collectors.toList());

    SalaryOperationMultipleResults allUsersEarningBetween200And3000 = (List<User> users) -> users.stream().filter(user -> user.getSalary() > 2000 && user.getSalary() < 3000).collect(Collectors.toList());

    SalaryOperationMultipleResults allUsersWithEvenEarnings = (List<User> users) -> users.stream().filter(user -> user.getSalary() % 2 == 0).collect(Collectors.toList());
    SalaryOperationMultipleResults allUsersWithOddEarnings = (List<User> users) -> users.stream().filter(user -> user.getSalary() % 2 != 0).collect(Collectors.toList());
}
