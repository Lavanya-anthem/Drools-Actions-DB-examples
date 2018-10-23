package com.atlas.client.extension.newhello;

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
import com.atlas.client.extension.newhello.VRNewhello.VFNewhello;
import com.atlas.client.extension.newhello.VRNewhello.VPNewhello;
import com.atlas.client.extension.newhello.VRNewhello.VSNewhello;
import com.atlas.client.extension.newhello.VRNewhello.VTNewhello;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Domain(value ="newhellolandingview", includeListeners = {ListenerType.websocket})
@Repo(value=Repo.Database.rep_none,cache=Repo.Cache.rep_device)
@Getter @Setter @ToString(callSuper=true)
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

 @Form(cssClass="oneColumn")
 private VFNewhelloLanding vfNewhellolanding;
}

@Model
@Getter @Setter
public static class VFNewhelloLanding {

    @Paragraph
	@Label(value = "Hello All! This is your landing page")
	private String title1;

}

}
