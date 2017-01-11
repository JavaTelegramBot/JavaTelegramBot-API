package pro.zackpollard.telegrambot.api.chat.inline;

import pro.zackpollard.telegrambot.api.chat.CallbackQuery;
import pro.zackpollard.telegrambot.api.chat.CallbackQueryType;

/**
 * @author zackp
 */
public interface InlineCallbackQuery extends CallbackQuery {

    /**
     * Gets the ID of the inline message that this callback query relates to
     *
     * @return The ID of the inline message
     */
    String getInlineMessageId();

    /**
     * Gets the data that was originally sent with the button used to trigger this InlineCallbackQuery
     *
     * @return The data that was original sent with the button used to trigger this InlineCallbackQuery
     */
    String getData();

    /**
     * Gets the CallbackQueryType for this callback query
     *
     * @return The CallbackQueryType for this callback query
     */
    @Override
    default CallbackQueryType getType() {

        return CallbackQueryType.INLINE_MESSAGE;
    }
}
