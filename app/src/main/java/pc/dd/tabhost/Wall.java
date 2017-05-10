package pc.dd.tabhost;

import java.util.List;

/**
 * Created by User on 26.04.2016.
 */
public class Wall {

    /**
     * count : 13
     * items : [{"id":7592,"from_id":44613087,"owner_id":44613087,"date":1461619535,"post_type":"post","text":"1","can_delete":1,"can_pin":1,"attachments":[{"type":"photo","photo":{"id":409976501,"album_id":-7,"owner_id":44613087,"photo_75":"https://pp.vk.me/c314918/v314918367/25d4/FXM_B-c21So.jpg","photo_130":"https://pp.vk.me/c314918/v314918367/25d5/KdBtWivqLuw.jpg","photo_604":"https://pp.vk.me/c314918/v314918367/25d6/-71Tz4dhvqo.jpg","width":500,"height":500,"text":"","date":1460195295,"post_id":7592,"access_key":"ae048e14243fbcb2a5"}}],"post_source":{"type":"vk"},"comments":{"count":0,"can_post":1},"likes":{"count":4,"user_likes":0,"can_like":1,"can_publish":0},"reposts":{"count":0,"user_reposted":0}}]
     */

    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {
        private int count;
        /**
         * id : 7592
         * from_id : 44613087
         * owner_id : 44613087
         * date : 1461619535
         * post_type : post
         * text : 1
         * can_delete : 1
         * can_pin : 1
         * attachments : [{"type":"photo","photo":{"id":409976501,"album_id":-7,"owner_id":44613087,"photo_75":"https://pp.vk.me/c314918/v314918367/25d4/FXM_B-c21So.jpg","photo_130":"https://pp.vk.me/c314918/v314918367/25d5/KdBtWivqLuw.jpg","photo_604":"https://pp.vk.me/c314918/v314918367/25d6/-71Tz4dhvqo.jpg","width":500,"height":500,"text":"","date":1460195295,"post_id":7592,"access_key":"ae048e14243fbcb2a5"}}]
         * post_source : {"type":"vk"}
         * comments : {"count":0,"can_post":1}
         * likes : {"count":4,"user_likes":0,"can_like":1,"can_publish":0}
         * reposts : {"count":0,"user_reposted":0}
         */

        private List<ItemsBean> items;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            private int id;
            private int from_id;
            private int owner_id;
            private int date;
            private String post_type;
            private String text;
            private int can_delete;
            private int can_pin;
            /**
             * type : vk
             */

            private PostSourceBean post_source;
            /**
             * count : 0
             * can_post : 1
             */

            private CommentsBean comments;
            /**
             * count : 4
             * user_likes : 0
             * can_like : 1
             * can_publish : 0
             */

            private LikesBean likes;
            /**
             * count : 0
             * user_reposted : 0
             */

            private RepostsBean reposts;
            /**
             * type : photo
             * photo : {"id":409976501,"album_id":-7,"owner_id":44613087,"photo_75":"https://pp.vk.me/c314918/v314918367/25d4/FXM_B-c21So.jpg","photo_130":"https://pp.vk.me/c314918/v314918367/25d5/KdBtWivqLuw.jpg","photo_604":"https://pp.vk.me/c314918/v314918367/25d6/-71Tz4dhvqo.jpg","width":500,"height":500,"text":"","date":1460195295,"post_id":7592,"access_key":"ae048e14243fbcb2a5"}
             */

            private List<AttachmentsBean> attachments;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFrom_id() {
                return from_id;
            }

            public void setFrom_id(int from_id) {
                this.from_id = from_id;
            }

            public int getOwner_id() {
                return owner_id;
            }

            public void setOwner_id(int owner_id) {
                this.owner_id = owner_id;
            }

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public String getPost_type() {
                return post_type;
            }

            public void setPost_type(String post_type) {
                this.post_type = post_type;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getCan_delete() {
                return can_delete;
            }

            public void setCan_delete(int can_delete) {
                this.can_delete = can_delete;
            }

            public int getCan_pin() {
                return can_pin;
            }

            public void setCan_pin(int can_pin) {
                this.can_pin = can_pin;
            }

            public PostSourceBean getPost_source() {
                return post_source;
            }

            public void setPost_source(PostSourceBean post_source) {
                this.post_source = post_source;
            }

            public CommentsBean getComments() {
                return comments;
            }

            public void setComments(CommentsBean comments) {
                this.comments = comments;
            }

            public LikesBean getLikes() {
                return likes;
            }

            public void setLikes(LikesBean likes) {
                this.likes = likes;
            }

            public RepostsBean getReposts() {
                return reposts;
            }

            public void setReposts(RepostsBean reposts) {
                this.reposts = reposts;
            }

            public List<AttachmentsBean> getAttachments() {
                return attachments;
            }

            public void setAttachments(List<AttachmentsBean> attachments) {
                this.attachments = attachments;
            }

            public static class PostSourceBean {
                private String type;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }
            }

            public static class CommentsBean {
                private int count;
                private int can_post;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getCan_post() {
                    return can_post;
                }

                public void setCan_post(int can_post) {
                    this.can_post = can_post;
                }
            }

            public static class LikesBean {
                private int count;
                private int user_likes;
                private int can_like;
                private int can_publish;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getUser_likes() {
                    return user_likes;
                }

                public void setUser_likes(int user_likes) {
                    this.user_likes = user_likes;
                }

                public int getCan_like() {
                    return can_like;
                }

                public void setCan_like(int can_like) {
                    this.can_like = can_like;
                }

                public int getCan_publish() {
                    return can_publish;
                }

                public void setCan_publish(int can_publish) {
                    this.can_publish = can_publish;
                }
            }

            public static class RepostsBean {
                private int count;
                private int user_reposted;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public int getUser_reposted() {
                    return user_reposted;
                }

                public void setUser_reposted(int user_reposted) {
                    this.user_reposted = user_reposted;
                }
            }

            public static class AttachmentsBean {
                private String type;
                /**
                 * id : 409976501
                 * album_id : -7
                 * owner_id : 44613087
                 * photo_75 : https://pp.vk.me/c314918/v314918367/25d4/FXM_B-c21So.jpg
                 * photo_130 : https://pp.vk.me/c314918/v314918367/25d5/KdBtWivqLuw.jpg
                 * photo_604 : https://pp.vk.me/c314918/v314918367/25d6/-71Tz4dhvqo.jpg
                 * width : 500
                 * height : 500
                 * text :
                 * date : 1460195295
                 * post_id : 7592
                 * access_key : ae048e14243fbcb2a5
                 */

                private PhotoBean photo;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public PhotoBean getPhoto() {
                    return photo;
                }

                public void setPhoto(PhotoBean photo) {
                    this.photo = photo;
                }

                public static class PhotoBean {
                    private int id;
                    private int album_id;
                    private int owner_id;
                    private String photo_75;
                    private String photo_130;
                    private String photo_604;
                    private int width;
                    private int height;
                    private String text;
                    private int date;
                    private int post_id;
                    private String access_key;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getAlbum_id() {
                        return album_id;
                    }

                    public void setAlbum_id(int album_id) {
                        this.album_id = album_id;
                    }

                    public int getOwner_id() {
                        return owner_id;
                    }

                    public void setOwner_id(int owner_id) {
                        this.owner_id = owner_id;
                    }

                    public String getPhoto_75() {
                        return photo_75;
                    }

                    public void setPhoto_75(String photo_75) {
                        this.photo_75 = photo_75;
                    }

                    public String getPhoto_130() {
                        return photo_130;
                    }

                    public void setPhoto_130(String photo_130) {
                        this.photo_130 = photo_130;
                    }

                    public String getPhoto_604() {
                        return photo_604;
                    }

                    public void setPhoto_604(String photo_604) {
                        this.photo_604 = photo_604;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getDate() {
                        return date;
                    }

                    public void setDate(int date) {
                        this.date = date;
                    }

                    public int getPost_id() {
                        return post_id;
                    }

                    public void setPost_id(int post_id) {
                        this.post_id = post_id;
                    }

                    public String getAccess_key() {
                        return access_key;
                    }

                    public void setAccess_key(String access_key) {
                        this.access_key = access_key;
                    }
                }
            }
        }
    }
}