package com.gihub.darkrose.telegramBot.service;

public interface SendBotMessageService {
    void sendMessage(String chatId, String message);
}
