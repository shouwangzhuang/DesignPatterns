package src.member;

import org.apache.commons.lang3.StringUtils;

/**
 * @author shou.wangzhuang
 * @date 2023/1/16 22:54
 */
public class ValidateHandler extends Handler{
    public void doHandle(Member member) {
        if (StringUtils.isEmpty(member.getLoginName())
                || StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("用户名或者密码为空");
            return;
        }
        System.out.println("用户名和密码为空，可以往下执行");
        chain.doHandle(member);
    }
}
