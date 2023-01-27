package src.member;

/**
 * @author shou.wangzhuang
 * @date 2023/1/16 22:42
 */
public class Member {
    private String loginName;
    private String loginPass;
    private String roleName;

    public Member(String loginName,String loginPass) {
        this.loginName = loginName;
        this.loginPass = loginPass;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String toString() {
        return "Member{" +
                "loginName=" + loginName + '\'' +
                ",loginPass=" + loginPass + '\'' +
                "}";
    }
}
