package com.ssh.util;

/**TODO
 * @author：Alice
 * @date: 2018年5月27日
 * @version 0.0.1
 * @description：饮食报告类
 */
public class DietReport {
	
	private static final int DEFAULT_PROTEIN      = 60;  // 蛋白质参考值
	private static final int DEFAULT_CARBOHYDRATE = 60;  // 糖类参考值
	private static final int DEFAULT_FAT          = 75;  // 脂肪参考值
	private static final int DEFAULT_DIETARYFIBER = 25;  // 膳食纤维参考值
	private static final int DEFAULT_MOISTURE     = 40;  // 水分参考值
	
	private int protein;       // 蛋白质
	private int carbohydrate;  // 糖类
	private int fat;           // 脂肪
	private int dietaryFiber;  // 膳食纤维
	private int moisture;      // 水分

	private String proteinStr;       // 蛋白质报告
	private String carbohydrateStr;  // 糖类报告
	private String fatStr;           // 脂肪报告
	private String dietaryFiberStr;  // 膳食纤维报告
	private String moistureStr;      // 水分报告
	
	/* setter、getter */
	
	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getDietaryFiber() {
		return dietaryFiber;
	}

	public void setDietaryFiber(int dietaryFiber) {
		this.dietaryFiber = dietaryFiber;
	}

	public int getMoisture() {
		return moisture;
	}

	public void setMoisture(int moisture) {
		this.moisture = moisture;
	}

	/* getter */
	
	public String getProteinStr() {
		return proteinStr;
	}

	public String getCarbohydrateStr() {
		return carbohydrateStr;
	}

	public String getFatStr() {
		return fatStr;
	}

	public String getDietaryFiberStr() {
		return dietaryFiberStr;
	}

	public String getMoistureStr() {
		return moistureStr;
	}
	
	/** 饮食成分初始化 */
	public DietReport() {
		this.protein      = -1;
		this.carbohydrate = -1;
		this.fat          = -1;
		this.dietaryFiber = -1;
		this.moisture     = -1;
		this.proteinStr      = "null";
		this.carbohydrateStr = "null";
		this.fatStr          = "null";
		this.dietaryFiberStr = "null";
		this.moistureStr     = "null";
	}

	/** 
	 * 饮食成分初始化 
	 * 
	 * @param protein 蛋白质
	 * @param carbohydrate 糖类
	 * @param fat 脂肪
	 * @param dietaryFiber 膳食纤维
	 * @param moisture 水分
	 */
	public DietReport(int protein, int carbohydrate, int fat, int dietaryFiber, int moisture) {
		this.protein      = protein;
		this.carbohydrate = carbohydrate;
		this.fat          = fat;
		this.dietaryFiber = dietaryFiber;
		this.moisture     = moisture;
		this.proteinStr      = "null";
		this.carbohydrateStr = "null";
		this.fatStr          = "null";
		this.dietaryFiberStr = "null";
		this.moistureStr     = "null";
	}
	
	/**
	 * 获取报告
	 * 
	 * @param num 数值
	 * @param defaultNum 参考数值
	 * @return 报告
	 */
	private String getReport(int num, int defaultNum) {
		String str = "";
		if (num >= defaultNum - 5 && num <= defaultNum + 5) {
			str = "充足";
		} else if (num < defaultNum - 5) {
			str = "不足";
		} else if (num > defaultNum + 5) {
			str = "过量";
		} else if (num == -1) {
			str = "init error.";
		} else {
			str = "null.";
		}
		return str;
	}
	
	/** 设置饮食建议 */
	public void setDietReport() {
		this.proteinStr      = getReport(protein, DEFAULT_PROTEIN);
		this.carbohydrateStr = getReport(carbohydrate, DEFAULT_CARBOHYDRATE);
		this.fatStr          = getReport(fat, DEFAULT_FAT);
		this.dietaryFiberStr = getReport(dietaryFiber, DEFAULT_DIETARYFIBER);
		this.moistureStr     = getReport(moisture, DEFAULT_MOISTURE);
	}
	
}