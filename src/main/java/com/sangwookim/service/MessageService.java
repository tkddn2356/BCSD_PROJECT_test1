package com.sangwookim.service;


import com.sangwookim.domain.Message;

import java.util.List;

public interface MessageService {

//    public List<Message> getSendList(String send_id);
//    public List<Message> getReceiveList(String recipient_id);
    public List<Message> getList(String mode, String user_id);
    public void write(Message message);
    public boolean modify(Message message);
    public boolean remove(Long id);



}
