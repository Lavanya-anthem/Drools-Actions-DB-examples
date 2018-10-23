package com.antheminc.oss.nimbus.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractEntity is a Querydsl query type for AbstractEntity
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAbstractEntity extends BeanPath<AbstractEntity<? extends java.io.Serializable>> {

    private static final long serialVersionUID = 962883029L;

    public static final QAbstractEntity abstractEntity = new QAbstractEntity("abstractEntity");

    public final StringPath _class = createString("_class");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.time.ZonedDateTime> createdDate = createDateTime("createdDate", java.time.ZonedDateTime.class);

    public final SimplePath<java.io.Serializable> id = createSimple("id", java.io.Serializable.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    public final DateTimePath<java.time.ZonedDateTime> lastModifiedDate = createDateTime("lastModifiedDate", java.time.ZonedDateTime.class);

    public final BooleanPath new$ = createBoolean("new");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractEntity(String variable) {
        super((Class) AbstractEntity.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractEntity(Path<? extends AbstractEntity> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QAbstractEntity(PathMetadata metadata) {
        super((Class) AbstractEntity.class, metadata);
    }

}

