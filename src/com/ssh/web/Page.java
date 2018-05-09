package com.ssh.web;

public class Page {

	int start; // 开始页数
	int count; // 每页显示个数
	int total; // 总个数
	String param; // 参数

	private static final int DEFAULTCOUNT = 5; // 默认每页显示5条

	/* set、get */

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	/**
	 * 是否有前一页
	 * @return Prev布尔值
	 */
	public boolean isHasPreviouse() {
		if (start == 0) {
			return false;
		}
		return true;

	}

	/**
	 * 是否有后一页
	 * @return last布尔值
	 */
	public boolean isHasNext() {
		if (start == getLast()) {
			return false;
		}
		return true;
	}

	/**
	 * 获取分页总数
	 * 
	 * @return 分页总数
	 */
	public int getTotalPage() {

		int totalPage = 0;
		if (0 == total % count) {
			totalPage = total / count;
		} else {
			totalPage = total / count + 1;
		}
		if (0 == totalPage) {
			totalPage = 1;
		}
		return totalPage;
	}

	/**
	 * 获取最后一页数值
	 * 
	 * @return 最后一页数值
	 */
	public int getLast() {
		int last = 0;
		if (0 == total % count) {
			last = total - count;
		} else {
			last = total - total % count;
		}
		last = last < 0 ? 0 : last;
		return last;
	}

	@Override
	public String toString() {
		return "Page: ["
			+ "start=" + start + ", count=" + count + ", total=" + total
			+ ", getStart()=" + getStart() + ", getCount()=" + getCount()
			+ ", isHasPreviouse()=" + isHasPreviouse() + ", isHasNext()=" + isHasNext()
			+ ", getTotalPage()=" + getTotalPage() + ", getLast()=" + getLast()
			+ "]";
	}

}
