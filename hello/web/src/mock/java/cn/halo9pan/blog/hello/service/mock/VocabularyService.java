/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 halo9pan.cn
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package cn.halo9pan.blog.hello.service.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import cn.halo9pan.blog.hello.core.Vocabulary;
import cn.halo9pan.blog.hello.service.IVocabularyService;

/**
 * @author panhao
 *
 */
public class VocabularyService implements IVocabularyService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.halo9pan.blog.hello.service.IVocabularyService#getAllVocabularies()
	 */
	@Override
	public List<Vocabulary> getAllVocabularies() {
		List<String> origin = Arrays.asList("One", "Two");
		List<Vocabulary> list = origin.stream().map(word -> new Vocabulary(word)).collect(Collectors.toList());
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.halo9pan.blog.hello.service.IVocabularyService#AddVocabulary(cn.halo9pan.blog.hello.core
	 * .Vocabulary)
	 */
	@Override
	public boolean addVocabulary(Vocabulary v) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.halo9pan.blog.hello.service.IVocabularyService#removeVocabulary(cn.halo9pan.blog.hello
	 * .core.Vocabulary)
	 */
	@Override
	public boolean removeVocabulary(Vocabulary v) {
		return false;
	}

}
