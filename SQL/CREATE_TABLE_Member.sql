CREATE TABLE `Member` (
    `MemberID`  bigint(4) NOT NULL AUTO_INCREMENT ,
    `MemberAccount`  varchar(50) NOT NULL ,
    `MemberPwd`  varchar(50) NOT NULL ,
    `MemberName`  varchar(50) NULL ,
    `MemberSex`  varchar(10) NULL ,
    `MemberEmail`  varchar(50) NULL ,
    `MemberPhone`  varchar(450) NULL ,
    `MemberDate`  datetime(6) NULL ,
    `MemberVit`  bigint NULL ,
    PRIMARY KEY (`MemberID`)
);