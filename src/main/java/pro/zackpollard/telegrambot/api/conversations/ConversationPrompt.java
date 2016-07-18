package pro.zackpollard.telegrambot.api.conversations;

import pro.zackpollard.telegrambot.api.chat.message.content.Content;
import pro.zackpollard.telegrambot.api.chat.message.content.ContentType;
import pro.zackpollard.telegrambot.api.chat.message.send.SendableMessage;

public interface ConversationPrompt<T extends Content> {
    ConversationPrompt END_CONVERSATION = null;

    ContentType type();
    ConversationPrompt process(ConversationContext context, T input);
    SendableMessage promptMessage(ConversationContext context);

    default void conversationEnded(ConversationContext context) {
    }
}
