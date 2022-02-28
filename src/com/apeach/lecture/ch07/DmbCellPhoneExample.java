package com.apeach.lecture.ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

			DmbCellPhone dmbcellPhone = new DmbCellPhone("자바폰","검정",10);
			
			System.out.println("모델:" + dmbcellPhone.model);
			System.out.println("색상:" + dmbcellPhone.color);

			System.out.println("채널:" + dmbcellPhone.channel);
			
			dmbcellPhone.powerOn();
			dmbcellPhone.bell();
			dmbcellPhone.sendVoice("여보세요");
			dmbcellPhone.receiveVoice("안녕하세요! 저는이명희입니다.");
			dmbcellPhone.sendVoice("예 반갑습니다");
			dmbcellPhone.hangUp();
			dmbcellPhone.turnOnDmb();
			dmbcellPhone.changeChannelDmb(12);
			dmbcellPhone.turnOffDmb();
			
		

	}

}
