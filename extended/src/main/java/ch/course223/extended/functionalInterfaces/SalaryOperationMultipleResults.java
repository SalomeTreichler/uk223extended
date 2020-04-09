package ch.course223.extended.functionalInterfaces;


import ch.course223.extended.domainModels.User;

import java.util.List;

@FunctionalInterface
public interface SalaryOperationMultipleResults {
    List<User> executeSalaryOption (List<User> users);
}
