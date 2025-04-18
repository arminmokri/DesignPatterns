package behavioral.chain_of_responsibility.rbac;

import java.util.*;
import java.util.stream.Collectors;

public class RoleUrlMapper {

    private static final Map<Role, List<String>> roleUrlMap = new HashMap<>();

    static {
        roleUrlMap.put(Role.ADMIN, Arrays.asList("/admin", "/user", "/dashboard"));
        roleUrlMap.put(Role.USER, Arrays.asList("/user", "/profile"));
    }

    private static List<String> getUrlsForRole(Role role) {
        return roleUrlMap.getOrDefault(role, Collections.emptyList());
    }

    public static boolean isAccessAllowed(Role role, String url) {
        return getUrlsForRole(role).contains(url);
    }

    public static boolean isUrlValid(String url){
        return roleUrlMap
                .values()
                .stream()
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList())
                .contains(url);
    }
}
