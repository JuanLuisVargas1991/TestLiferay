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

package com.liferay.Formulario.model.impl;

import com.liferay.Formulario.model.Registro;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Registro in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RegistroCacheModel
	implements CacheModel<Registro>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegistroCacheModel)) {
			return false;
		}

		RegistroCacheModel registroCacheModel = (RegistroCacheModel)object;

		if (registroId == registroCacheModel.registroId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, registroId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{registroId=");
		sb.append(registroId);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Registro toEntityModel() {
		RegistroImpl registroImpl = new RegistroImpl();

		registroImpl.setRegistroId(registroId);

		if (nombre == null) {
			registroImpl.setNombre("");
		}
		else {
			registroImpl.setNombre(nombre);
		}

		if (email == null) {
			registroImpl.setEmail("");
		}
		else {
			registroImpl.setEmail(email);
		}

		registroImpl.resetOriginalValues();

		return registroImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		registroId = objectInput.readLong();
		nombre = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(registroId);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long registroId;
	public String nombre;
	public String email;

}