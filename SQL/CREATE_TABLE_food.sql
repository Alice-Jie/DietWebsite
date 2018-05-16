CREATE TABLE `Food` (
	`FoodID`  bigint(4) NOT NULL AUTO_INCREMENT ,
	`FoodName`  varchar(50) NOT NULL ,
	`FoodPrice`  double(50,0) NULL ,
	`FoodDescribe`  varchar(50) NULL ,
	`FoodVit`  bigint(4) NULL ,
	PRIMARY KEY (`FoodID`)
);

