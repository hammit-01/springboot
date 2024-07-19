package com.example.demo;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import java.util.List;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.answer.Answer;
import com.example.demo.answer.AnswerRepository;
import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;

@SpringBootTest
class Demo1ApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Transactional

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
//		Question q =this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
		
		//findBySubjectAndContent 메서드
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다");
//		assertEquals(1, q.getId());
		
		//findBySubjectLike 메서드
//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
		
		//데이터 수정
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);
		
		//데이터 삭제
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1, this.questionRepository.count());
		
		//답변 데이터 저장
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다");
		a.setQuestion(q);
		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
		
		//답변 데이터 조회
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a =oa.get();
//		assertEquals(2, a.getQuestion().getId());
		
		//질문 데이터를 통해 답변 데이터 찾기
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		List<Answer> answerList = q.getAnswerList();
//		
//		assertEquals(1, answerList.size());
//		assertEquals("네 자동으로 생성됩니다", answerList.get(0).getContent());
	}

}
