package org.telegram.botapi.api.chat.message.send;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.telegram.botapi.api.chat.message.Message;
import org.telegram.botapi.api.chat.message.ReplyMarkup;

/**
 * @author Zack Pollard
 */

@RequiredArgsConstructor
@Builder
public class SendableStickerMessage implements SendableMessage, ReplyingOptions {

    @NonNull
    @Getter
	private final InputFile sticker;
    @Getter
	private final Message replyTo;
    @Getter
	private final ReplyMarkup replyMarkup;

    @Override
    public MessageType getType() {
        return MessageType.STICKER;
    }
}