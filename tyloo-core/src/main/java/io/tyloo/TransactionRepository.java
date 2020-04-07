package io.tyloo;

import io.tyloo.api.TransactionXid;

import java.util.Date;
import java.util.List;

/*
 *
 * �����(����tcc���ݿ��dao)
 * ��ʵ�����ڱ�����Ŀdubbo-order�е�config.spring.local��appcontext-service-dao.xml�����ã�
 * ����ʵ������SpringJdbcTransactionRepository���̳�JdbcTransactionRepository����Ϊorder��capital��redpacket��3�������ķ���
 * ����ÿһ��ģ���ж���appcontext-service-dao.xml���������ӳ�
 *
 * @Author:Zh1Cheung zh1cheunglq@gmail.com
 * @Date: 19:00 2019/6/12
 *
 */

public interface TransactionRepository {

    int create(Transaction transaction);

    int update(Transaction transaction);

    int delete(Transaction transaction);

    Transaction findByXid(TransactionXid xid);

    List<Transaction> findAllUnmodifiedSince(Date date);
}