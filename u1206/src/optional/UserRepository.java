package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository(){
        // 더미 데이터 추가
        users.add(new User(1L, "Alice"));
        users.add(new User(2L, "Bob"));
        users.add(new User(3L, "Charlie"));
    }

    public Optional<User> findById(long id) {
//        for(User user : users){
//            if(user.getId().equals(id)){      // 매개변수로 받은 id와 users 리스트에 있는 id가 같으면
//                return Optional.of(user);       // Optional에 담아서 반환
//            }
//        }
//        return Optional.empty();        // 없으면 빈 Optional 반환 -> 에러 발생x

        return  users.stream()
                .filter(user->user.getId().equals(id))
                .findFirst();        // 찾으면 바로 중지
    }
}
