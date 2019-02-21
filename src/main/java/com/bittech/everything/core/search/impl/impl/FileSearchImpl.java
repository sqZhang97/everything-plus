//package com.bittech.everything.core.search.impl.impl;
//
//import com.bittech.everything.core.dao.FileIndexDao;
//import com.bittech.everything.core.model.Condition;
//import com.bittech.everything.core.model.Thing;
//import com.bittech.everything.core.search.FileSearch;
//
//import java.util.List;
//
///**
// * 业务层
// */
//public class FileSearchImpl implements FileSearch {
//
//    private final FileIndexDao fileIndexDao;
//
//    public FileSearchImpl(FileIndexDao fileIndexDao) {
//        this.fileIndexDao = fileIndexDao;
//    }
//
//    public List<Thing> search(Condition condition) {
//        return this.fileIndexDao.search(condition);
//    }
//}
