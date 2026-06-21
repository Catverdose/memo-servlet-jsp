package memo.dto;

public class MemoDto {
	//메모 객체
	private long memoId;
	private long userSeq;
	private String title;
	private String content;
	private String regDt;
	private String modDt;
	
	public MemoDto() {}
	
	public MemoDto(long memoId, long userSeq, String title, String content, String regDt, String modDt){
		this.memoId = memoId;
		this.userSeq = userSeq;
		this.title = title;
		this.content =content;
		this.regDt = regDt;
		this.modDt = modDt;
	}
	
	public long getMemoId() {
		return memoId;
	}
	public void setMemoId(long memoId) {
		this.memoId = memoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(long userSeq) {
		this.userSeq = userSeq;
	}

	public String getRegDt() {
		return regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	public String getModDt() {
		return modDt;
	}

	public void setModDt(String modDt) {
		this.modDt = modDt;
	}

	@Override
	public String toString() {
		return "MemoDto [memoId=" + memoId + ", userSeq=" + userSeq + ", title=" + title + ", content=" + content
				+ ", regDt=" + regDt + ", modDt=" + modDt + "]";
	}

	

}
