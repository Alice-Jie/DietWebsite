package com.ssh.util;

/**TODO
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.1
 * @description：实现分页功能
 */
public class Page {

	private int first   = 0; // 首页
	private int current = 0; // 当前
	private int last    = 0; // 末页
	private int count   = 0; // 数据总数
	private int total   = 0; // 分页总数

	private static final int LIMIT = 10; // 每页显示的条数

	/* setter、getter */

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
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

	public static int getLimit() {
		return LIMIT;
	}

	@Override
	public String toString() {
		return "Page [first=" + first + ", current=" + current + ", last=" + last + ", count=" + count + ", total="
				+ total + "]";
	}
	
}
