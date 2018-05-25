package com.sowad.t2.app.models.dao;

import java.util.List;
import com.sowad.t2.app.models.entity.Plato;

public interface IPlatoDao {

	public List<Plato> findAll();
}
