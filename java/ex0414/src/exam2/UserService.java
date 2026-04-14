package exam2;

import java.util.List;

public class UserService {
	public UserFilter getFilter(String type) {
		if (type.equals("adult")) {
			return x -> x.age > 20;
		} else if (type.equals("seoul")) {
			return x -> x.city.equals("서울");
		} else if (type.equals("kim")) {
			return x -> x.name.startsWith("김");
		} else return null;
	} // getFilter ed
	
	public void FilterUsers(List<User> list,UserFilter userFilter) {
		for (User user : list) {
			if (userFilter.test(user)) {
				System.out.printf("%s / %d / %s\n",user.name,user.age,user.city);
			}
		} // for ed
	} // FilterUsers ed
	
}
