CREATE TABLE `Food` (
	`FoodID`  bigint(4) NOT NULL AUTO_INCREMENT ,
	`FoodName`  varchar(50) NOT NULL ,
	`FoodPrice`  double(50,0) NULL ,
	`FoodDescribe`  varchar(200) NULL ,
    `FoodDate`  datetime(6) NULL ,
    `FoodProtein`  bigint(4) NOT NULL ,
    `FoodCarbohydrate`  bigint(4) NOT NULL ,
    `FoodFat`  bigint(4) NOT NULL ,
    `FoodDietaryFiber`  bigint(4) NOT NULL ,
    `FoodMoisture`  bigint(4) NOT NULL ,
	PRIMARY KEY (`FoodID`)
);

