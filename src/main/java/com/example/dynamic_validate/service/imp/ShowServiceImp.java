package com.example.dynamic_validate.service.imp;

import com.example.dynamic_validate.dao.SamlTypeLevelDao;
import com.example.dynamic_validate.dao.ProjectDao;
import com.example.dynamic_validate.dao.SamlTypeDao;
import com.example.dynamic_validate.dao.SourceDao;
import com.example.dynamic_validate.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowServiceImp implements ShowService {
    @Autowired
    private SamlTypeDao samlTypeDao;

    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private SourceDao sourceDao;
    @Autowired
    private SamlTypeLevelDao samlTypeLevelDao;

}
