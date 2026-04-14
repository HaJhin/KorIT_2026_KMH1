package exam2;

@FunctionalInterface
public interface UserFilter {
	boolean test(User user);
}
