package com.example.comunal;

import com.example.comunal.model.Mul;
import com.example.comunal.model.Sub;
import com.example.comunal.model.Sum;
import com.example.comunal.model.TermList;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ComunalApplicationTests {


	@Test
	void parseContent() throws Exception{
		Sum sum = new Sum();
		Sub sub = new  Sub();
		Mul mul = new Mul();

		String testableString = "/xxx/10/10/10/10";
		List<Integer> parsedString = new ArrayList<>(
				Arrays.asList(10,10,10,10));

		List<Integer> sumParsed = sum.parseContent(testableString).getTerms();
		List<Integer> subParsed = sub.parseContent(testableString).getTerms();
		List<Integer> mulParsed = mul.parseContent(testableString).getTerms();

		assertEquals(parsedString,sumParsed);
		assertEquals(parsedString,subParsed);
		assertEquals(parsedString,mulParsed);
	}



}
