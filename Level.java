package cn.mldn.em.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Level implements Serializable {
	private Integer lid ;
	private Double losal ;
	private Double hisal ;
	private String title ;
	private String flag ;
	private String note ;    //devre分支上进行修改
	private String noted ;    //D盘仓库中对devre分支上进行修改
	private String note5 ;    //在E盘的devre分支上进行修改
	private String edit;      //同一个分支被两个人一前一后的条,出现冲突后,手动修改完了冲突
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public Double getLosal() {
		return losal;
	}
	public void setLosal(Double losal) {
		this.losal = losal;
	}
	public Double getHisal() {
		return hisal;
	}
	public void setHisal(Double hisal) {
		this.hisal = hisal;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
