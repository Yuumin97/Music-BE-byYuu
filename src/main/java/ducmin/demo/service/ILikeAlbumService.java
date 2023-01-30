package ducmin.demo.service;

import ducmin.demo.model.LikeAlbum;

import java.util.Optional;

public interface ILikeAlbumService extends IGeneratorService<LikeAlbum>{
    Optional<LikeAlbum> findBySongIdAndUserId(Long song_id, Long user_id);
}
