package com.atlas.client.extension.newhello.view;

import javax.validation.constraints.NotNull;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Model;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.Execution.Config;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Button;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Form;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Header;

import javax.validation.constraints.NotNull;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Model;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.Execution.Config;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Button;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Form;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Header;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Page;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Paragraph;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Section;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.TextBox;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Tile;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.ViewRoot;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;
import com.atlas.client.extension.newhello.core.Name;
import com.atlas.client.extension.newhello.view.VRNewhello.VFNewhello;
import com.atlas.client.extension.newhello.view.VRNewhello.VPNewhello;
import com.atlas.client.extension.newhello.view.VRNewhello.VSNewhello;
import com.atlas.client.extension.newhello.view.VRNewhello.VTNewhello;

import com.antheminc.oss.nimbus.domain.defn.MapsTo;
import com.antheminc.oss.nimbus.domain.defn.MapsTo.Path;
import com.antheminc.oss.nimbus.domain.defn.MapsTo.Type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Domain(value ="newhellolandingview", includeListeners = {ListenerType.websocket})
@Repo(value=Repo.Database.rep_none,cache=Repo.Cache.rep_device)
@Getter @Setter @ToString(callSuper=true)
@MapsTo.Type(Name.class)
@ViewRoot(layout = "home")

public class VRNewHelloLanding {
	@Page(defaultPage=true)
    private VPNewhelloLanding vpNewhellolanding;

@Model
@Getter @Setter
public static class VPNewhelloLanding{

@Tile(size = Tile.Size.Large)
private VTNewhelloLanding vtNewhellolanding;
}

@Model
@Getter @Setter
public static class VTNewhelloLanding{

@Header(size=Header.Size.H3)
private String addHelloWorldHeader;

@Section
private VSNewhelloLanding vsNewhellolanding;
}
@Model
@Getter @Setter
public static class VSNewhelloLanding{

 @Path(linked=false)
 @Form(cssClass="oneColumn")
 private VFNewhelloLanding vfNewhellolanding;
}

@Model
@Getter @Setter
@MapsTo.Type(Name.class)
public static class VFNewhelloLanding {



	@TextBox(postEventOnChange=true)
	@Label("First Name")
	@MapsTo.Path private String firstName;


	@TextBox (postEventOnChange=true)
	@Label("Last Name")
	@MapsTo.Path private String lastName;


  // Get the parameters from Name.java
	@Config(url = "/p/Name/_new?fn=_initEntity&target=/firstName&json=\"<!../firstName!>\"&target=/lastName&json=\"<!../lastName!>\"")
	@Button(style=Button.Style.PRIMARY, type = Button.Type.submit)
	@Label("Click to insert into DB.")
	private String clickMe;

}

}