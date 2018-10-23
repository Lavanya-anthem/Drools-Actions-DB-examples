package com.atlas.client.extension.newhello.core;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.Repo.Cache;
import com.antheminc.oss.nimbus.domain.defn.Repo.Database;
import com.antheminc.oss.nimbus.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Domain(value="Name", includeListeners={ListenerType.persistence, ListenerType.update})
@Repo(value=Database.rep_mongodb, cache=Cache.rep_device)
@Getter
@Setter
@ToString(callSuper=true)

public class Name extends AbstractEntity.IdLong{

	private static final long serialVersionUID = 1L;

	private String firstName;

	private String lastName;
}