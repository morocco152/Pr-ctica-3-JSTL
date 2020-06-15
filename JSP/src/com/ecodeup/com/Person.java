/**
 * 
 */
package com.ecodeup.com;

import java.io.Serializable;
import java.util.List;

import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.DocTreeVisitor;
import com.sun.source.doctree.SerialDataTree;

/**
 * @author lm
 *
 */
public class Person implements Serializable, SerialDataTree {

	// instacia persona
	private long personId;
	private String firstName;
	private String userid;
	private String password;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R, D> R accept(DocTreeVisitor<R, D> arg0, D arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kind getKind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends DocTree> getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
