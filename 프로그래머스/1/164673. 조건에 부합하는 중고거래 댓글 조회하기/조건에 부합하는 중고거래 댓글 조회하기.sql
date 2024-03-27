select gb.title, gb.board_id, gr.reply_id, gr.writer_id, gr.contents, substr(gr.created_date, 1, 10) created_date
from used_goods_board gb inner join used_goods_reply gr on gb.board_id = gr.board_id
where gb.created_date like "2022-10%"
order by 6,1