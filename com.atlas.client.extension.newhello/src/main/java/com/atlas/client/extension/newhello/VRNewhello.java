package com.atlas.client.extension.newhello;

import javax.validation.constraints.NotNull;
import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Model;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Form;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Header;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Page;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Paragraph;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Section;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.TextBox;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Tile;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.ViewRoot;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;
import com.antheminc.oss.nimbus.domain.defn.extension.Rule;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Domain(value ="newhelloview", includeListeners = {ListenerType.websocket})
@Repo(value=Repo.Database.rep_none,cache=Repo.Cache.rep_device)
@Getter @Setter @ToString(callSuper=true)
@ViewRoot(layout = "home")
public class VRNewhello {

	 @Page(defaultPage=true)
	    private VPNewhello vpNewhello;

@Model
@Getter @Setter
public static class VPNewhello{

  @Tile(size = Tile.Size.Large)
  private VTNewhello vtNewhello;
}

@Model
@Getter @Setter
public static class VTNewhello{

 @Header(size=Header.Size.H3)
 private String addHelloWorldHeader;

 @Section
 private VSNewhello vsNewhello;
}
@Model
@Getter @Setter
public static class VSNewhello{

     @Form(cssClass="oneColumn")
     private VFNewhello vfNewhello;
 }

@Model
 @Getter @Setter
 public static class VFNewhello {

	    @Paragraph
		@Label(value = "Hello All!")
		private String title1;

	   // Listens to an event change in the textbox
        @TextBox(postEventOnChange=true) @NotNull
        @Label("Enter your name:")
        @Rule("sample")
         private String itname;

        @TextBox @NotNull
        @Label(" You have entered:") private String otname;
}
}