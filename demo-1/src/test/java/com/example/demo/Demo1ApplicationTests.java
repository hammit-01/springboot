package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.util.Optional;

//import java.util.List;
//import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class Demo1ApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		// 어러 행 주석 처리 Ctrl + /
		// 질문 데이터 저장
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링 부트 모델 질문입니다");
//		q2.setContent("id는 자동으로 생성되나요>");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
		// findAll 매서드
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		//findById 메서드
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if (oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
		
		//finBySubject 메서드
		Question q =this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(1, q.getId());
	}

}
