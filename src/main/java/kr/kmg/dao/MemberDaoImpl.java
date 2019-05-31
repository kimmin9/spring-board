package kr.kmg.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.kmg.vo.Member;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSession SqlSession;
	
	public void setSqlSession(SqlSession sqlSession){
        this.SqlSession = sqlSession;
    }
	
	@Override
	public void insertmember(Member mem) {
		SqlSession.insert("insertmember", mem);
	}

}
