package com.devteria.file.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.devteria.file.dto.FileInfo;
import com.devteria.file.entity.FileMgmt;

@Mapper(componentModel = "spring")
public interface FileMgmtMapper {
    @Mapping(target = "id", source = "name")
    FileMgmt toFileMgmt(FileInfo fileInfo);
}
