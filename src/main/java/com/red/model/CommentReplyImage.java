package com.red.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "comment_reply_images")
@Data
public class CommentReplyImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_reply_id", referencedColumnName = "id", nullable = false)
    private CommentReply commentReplyId;

    @OneToOne(cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "media_id", referencedColumnName = "id", nullable = false)
    private Media mediaId;

    public CommentReplyImage(){}
}
