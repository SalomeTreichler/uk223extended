package ch.course223.extended.functionalInterfaces;

import ch.course223.extended.domainModels.User;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
public interface SalaryOperationSingleResult {
    Optional<User> executeSalaryOperation(List<User> users);
}
