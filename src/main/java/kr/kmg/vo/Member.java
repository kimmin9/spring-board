package kr.kmg.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//create table `member` (
//`m_no` int auto_increment primary key,
//`m_email` varchar(40) not null,
//`m_pw` varchar(200)not null,
//`m_name` varchar(10)not null,
//`m_lev` int not null,
//`m_tempkey` varchar(50)
//);
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Member {
	private int m_no;
	private String m_email;
	private String m_pw;
	private String m_name;
	private int m_lev;
	private String m_tempkey;
	
	
	

}
