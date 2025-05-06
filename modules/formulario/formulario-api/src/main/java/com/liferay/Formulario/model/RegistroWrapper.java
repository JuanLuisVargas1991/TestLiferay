/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.Formulario.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Registro}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registro
 * @generated
 */
public class RegistroWrapper
	extends BaseModelWrapper<Registro>
	implements ModelWrapper<Registro>, Registro {

	public RegistroWrapper(Registro registro) {
		super(registro);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("registroId", getRegistroId());
		attributes.put("nombre", getNombre());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long registroId = (Long)attributes.get("registroId");

		if (registroId != null) {
			setRegistroId(registroId);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	@Override
	public Registro cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the email of this registro.
	 *
	 * @return the email of this registro
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the nombre of this registro.
	 *
	 * @return the nombre of this registro
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the primary key of this registro.
	 *
	 * @return the primary key of this registro
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registro ID of this registro.
	 *
	 * @return the registro ID of this registro
	 */
	@Override
	public long getRegistroId() {
		return model.getRegistroId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the email of this registro.
	 *
	 * @param email the email of this registro
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the nombre of this registro.
	 *
	 * @param nombre the nombre of this registro
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the primary key of this registro.
	 *
	 * @param primaryKey the primary key of this registro
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registro ID of this registro.
	 *
	 * @param registroId the registro ID of this registro
	 */
	@Override
	public void setRegistroId(long registroId) {
		model.setRegistroId(registroId);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected RegistroWrapper wrap(Registro registro) {
		return new RegistroWrapper(registro);
	}

}