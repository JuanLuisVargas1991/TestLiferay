package com.vass.portlet.portlet;

import com.vass.portlet.constants.FormularioPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.ServiceContext;

import com.liferay.Formulario.model.Registro;
import com.liferay.Formulario.service.RegistroLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import java.io.IOException;

import org.osgi.service.component.annotations.Component;


/**
 * @author juanluis.vargas
 */



@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Formulario",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FormularioPortletKeys.FORMULARIO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class


)

public class FormularioPortlet extends MVCPortlet {
@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		String nombre = ParamUtil.getString(actionRequest, "nombre");
		String email = ParamUtil.getString(actionRequest, "email");

		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Registro.class.getName(), actionRequest);

			RegistroLocalServiceUtil.addRegistro(nombre, email, serviceContext);
		}
		catch (Exception e) {
			throw new PortletException("Error al guardar el registro", e);
		}
	}

}