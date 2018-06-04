package com.ssh.util;

/**TODO
 * @author：Alice
 * @date: 2018年6月04日
 * @version 0.0.1
 * @description：智能推荐类
 */
public class Recommend {

	private static final int DEFAULT_PROTEIN      = 60;  // 蛋白质参考值
	private static final int DEFAULT_CARBOHYDRATE = 60;  // 糖类参考值
	private static final int DEFAULT_FAT          = 75;  // 脂肪参考值
	private static final int DEFAULT_DIETARYFIBER = 25;  // 膳食纤维参考值
	private static final int DEFAULT_MOISTURE     = 40;  // 水分参考值
	
	private int memberProteinWeight      = 0;  // 会员蛋白质摄入量
	private int memberCarbohydrateWeight = 0;  // 会员糖类摄入量
	private int memberFatWeight          = 0;  // 会员脂肪摄入量
	private int memberDietaryFiberWeight = 0;  // 会员膳食纤维摄入量
	private int memberMoistureWeight     = 0;  // 会员水分摄入量
	
	private int foodProteinWeight      = 0;  // 菜品蛋白质权重
	private int foodCarbohydrateWeight = 0;  // 菜品糖类权重
	private int foodFatWeight          = 0;  // 菜品脂肪权重
	private int foodDietaryFiberWeight = 0;  // 菜品膳食纤维权重
	private int foodMoistureWeight     = 0;  // 菜品水分权重
	
	/** getter */
	
	public int getMemberProteinWeight() {
		return memberProteinWeight;
	}

	public int getMemberCarbohydrateWeight() {
		return memberCarbohydrateWeight;
	}

	public int getMemberFatWeight() {
		return memberFatWeight;
	}

	public int getMemberDietaryFiberWeight() {
		return memberDietaryFiberWeight;
	}

	public int getMemberMoistureWeight() {
		return memberMoistureWeight;
	}

	public int getFoodProteinWeight() {
		return foodProteinWeight;
	}

	public int getFoodCarbohydrateWeight() {
		return foodCarbohydrateWeight;
	}

	public int getFoodFatWeight() {
		return foodFatWeight;
	}

	public int getFoodDietaryFiberWeight() {
		return foodDietaryFiberWeight;
	}

	public int getFoodMoistureWeight() {
		return foodMoistureWeight;
	}	

	/**
	 * 获取权重
	 * 
	 * @param num 数值
	 * @param defaultNum 参考数值
	 * @return 权重
	 */
	private int getWeight(int num, int defaultNum) {
		int weight = 0;
		if (num >= defaultNum - 5 && num <= defaultNum + 5) {
			weight = 0;
		} else if (num < defaultNum - 5) {
			weight = 1;
		} else if (num > defaultNum + 5) {
			weight = -1;
		} else {
			weight = 0;
			System.out.println("num is error.");
		}
		return weight;
	}
	
	/** 
	 * 设置会员权重
	 * 
	 * @param protein 会员蛋白质摄入量
	 * @param carbohydrate 会员糖类摄入量
	 * @param fat 会员脂肪摄入量
	 * @param dietaryFiber 会员膳食纤维摄入量
	 * @param moisture 会员水分摄入量
	 */
	public void setMemberWeight(int protein, int carbohydrate, int fat, int dietaryFiber, int moisture) {
		memberProteinWeight      = getWeight(protein ,DEFAULT_PROTEIN);
		memberCarbohydrateWeight = getWeight(carbohydrate, DEFAULT_CARBOHYDRATE);
		memberFatWeight          = getWeight(fat, DEFAULT_FAT);
		memberDietaryFiberWeight = getWeight(dietaryFiber, DEFAULT_DIETARYFIBER);
		memberMoistureWeight     = getWeight(moisture, DEFAULT_MOISTURE);
	}
	
	/** 
	 * 设置菜品权重
	 * 
	 * @param protein 菜品蛋白质参考量
	 * @param carbohydrate 菜品糖类参考量
	 * @param fat 菜品脂肪参考量
	 * @param dietaryFiber 菜品膳食纤维参考量
	 * @param moisture 菜品水分参考量
	 */
	public void setFoodWeight(int protein, int carbohydrate, int fat, int dietaryFiber, int moisture) {
		foodProteinWeight      = getWeight(protein ,DEFAULT_PROTEIN);
		foodCarbohydrateWeight = getWeight(carbohydrate, DEFAULT_CARBOHYDRATE);
		foodFatWeight          = getWeight(fat, DEFAULT_FAT);
		foodDietaryFiberWeight = getWeight(dietaryFiber, DEFAULT_DIETARYFIBER);
		foodMoistureWeight     = getWeight(moisture, DEFAULT_MOISTURE);
	}
	
	/** 
	 * 权重比较
	 * 
	 * @param weight1 会员权值
	 * @param weight2 菜品权值
	 * @return 比较权值
	 */
	private int comparisonOfWeight(int weight1, int weight2) {
		int weight = 0;
		if (weight1 + weight2 == 0) {
			weight = 1;
		} else if (Math.abs(weight1 + weight2) == 1) {
			weight = 0;
		} else if (Math.abs(weight1 + weight2) >= 2) {
			weight = -1;
		} else {
			weight = 0;
		}
		return weight;
	}
	
	/**
	 * 获取菜品总权重
	 * 
	 * @reurn 菜品比较权重
	 */
	public int getFoodWeightCount() {
		return comparisonOfWeight(foodProteinWeight, memberProteinWeight)
			 + comparisonOfWeight(foodCarbohydrateWeight, memberCarbohydrateWeight)
			 + comparisonOfWeight(foodFatWeight, memberFatWeight)
			 + comparisonOfWeight(foodDietaryFiberWeight, memberDietaryFiberWeight)
			 + comparisonOfWeight(foodMoistureWeight, memberMoistureWeight)
			 ;
	}
	
}