package com.inc.admin.dto.sys.req;

import javax.validation.constraints.NotBlank;

public class UpPwdReq {

    @NotBlank(message = "原密码不能为空")
    private String oldPwd;

    @NotBlank(message = "新密码不能为空")
    private String newPwd;

    @NotBlank(message = "确认密码不能为空")
    private String confirmPwd;

    public UpPwdReq() {
    }

    public @NotBlank(message = "原密码不能为空") String getOldPwd() {
        return this.oldPwd;
    }

    public @NotBlank(message = "新密码不能为空") String getNewPwd() {
        return this.newPwd;
    }

    public @NotBlank(message = "确认密码不能为空") String getConfirmPwd() {
        return this.confirmPwd;
    }

    public void setOldPwd(@NotBlank(message = "原密码不能为空") String oldPwd) {
        this.oldPwd = oldPwd;
    }

    public void setNewPwd(@NotBlank(message = "新密码不能为空") String newPwd) {
        this.newPwd = newPwd;
    }

    public void setConfirmPwd(@NotBlank(message = "确认密码不能为空") String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UpPwdReq)) return false;
        final UpPwdReq other = (UpPwdReq) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$oldPwd = this.getOldPwd();
        final Object other$oldPwd = other.getOldPwd();
        if (this$oldPwd == null ? other$oldPwd != null : !this$oldPwd.equals(other$oldPwd)) return false;
        final Object this$newPwd = this.getNewPwd();
        final Object other$newPwd = other.getNewPwd();
        if (this$newPwd == null ? other$newPwd != null : !this$newPwd.equals(other$newPwd)) return false;
        final Object this$confirmPwd = this.getConfirmPwd();
        final Object other$confirmPwd = other.getConfirmPwd();
        if (this$confirmPwd == null ? other$confirmPwd != null : !this$confirmPwd.equals(other$confirmPwd))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UpPwdReq;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $oldPwd = this.getOldPwd();
        result = result * PRIME + ($oldPwd == null ? 43 : $oldPwd.hashCode());
        final Object $newPwd = this.getNewPwd();
        result = result * PRIME + ($newPwd == null ? 43 : $newPwd.hashCode());
        final Object $confirmPwd = this.getConfirmPwd();
        result = result * PRIME + ($confirmPwd == null ? 43 : $confirmPwd.hashCode());
        return result;
    }

    public String toString() {
        return "UpPwdReq(oldPwd=" + this.getOldPwd() + ", newPwd=" + this.getNewPwd() + ", confirmPwd=" + this.getConfirmPwd() + ")";
    }
}
