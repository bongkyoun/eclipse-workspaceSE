package com.itwill.member.test;

import com.itwill.member.dao.MemberDao;

public class MemberDatTesetMain {

	public static void main(String[] args) throws Exception{
		MemberDao memberDao = new MemberDao();
		System.out.println(memberDao.selectAll());

	}

}
