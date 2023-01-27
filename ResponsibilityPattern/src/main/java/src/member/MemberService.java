package src.member;

/**
 * @author shou.wangzhuang
 * @date 2023/1/16 23:12
 */
public class MemberService {
    public void login(String loginName,String loginPass) {
        Handler validHandler = new ValidateHandler();
        Handler loginHandler = new LoginHandler();
        Handler authHandler = new AuthHandler();

        validHandler.next(loginHandler);
        loginHandler.next(authHandler);

        validHandler.doHandle(new Member(loginName,loginPass));
    }
}
