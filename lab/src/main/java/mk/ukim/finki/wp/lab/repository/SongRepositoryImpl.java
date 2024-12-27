//package mk.ukim.finki.wp.lab.repository;
//
//import mk.ukim.finki.wp.lab.model.Album;
//import mk.ukim.finki.wp.lab.model.Song;
//import mk.ukim.finki.wp.lab.modelHolder.SongHolder;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//import static mk.ukim.finki.wp.lab.modelHolder.SongHolder.songList;
//
//@Repository
//public class SongRepositoryImpl implements SongRepository {
//
////    @Override
////    public Song findByTrackId(String trackId) {
////        return songList.stream().filter(id -> id.getTrackId().equals(trackId)).findFirst().orElse(null);
////    }
//
//    @Override
//    public Optional<Song> findById(Long id) {
//        if (id == null) {
//            return Optional.empty();
//        }
//        return songList.stream()
//                .filter(song -> song.getId().equals(id))
//                .findFirst();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Song save(Song song) {
////        SongHolder.songList.add(new Song(song.getTrackId(), song.getTitle(), song.getGenre(), song.getReleaseYear(), song.getAlbum()));
//        SongHolder.songList.removeIf(s -> s.equals(song));
//        SongHolder.songList.add(song);
//        return song;
////        Optional<Song> existingSong = this.findById(song.getId());
////        if (existingSong.isPresent()) {
////            // Update the existing song
////            Song existing = existingSong.get();
////            existing.setTitle(song.getTitle());
////            existing.setGenre(song.getGenre());
////            existing.setReleaseYear(song.getReleaseYear());
////            existing.setAlbum(song.getAlbum());
////        } else {
////            // Add a new song
////            songList.add(song);
////        }
////        return song;
//    }
//
//    @Override
//    public List<Song> findAllByAlbum_Id(Long albumId) {
////        return songList.stream().filter(albId -> albId.getAlbum().getId().equals(albumId)).collect(Collectors.toList());
//        return songList.stream().filter(albId -> albId.getId().equals(albumId)).collect(Collectors.toList());
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Song> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Song> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Song getOne(Long aLong) {
//        return songList.stream().filter(id -> id.getId().equals(aLong)).findFirst().orElse(null);
//    }
//
//    @Override
//    public Song getById(Long aLong) {
//        return songList.stream().filter(id -> id.getId().equals(aLong)).findFirst().orElse(null);
//    }
//
//    @Override
//    public Song getReferenceById(Long aLong) {
//        return songList.stream().filter(id -> id.getId().equals(aLong)).findFirst().orElse(null);
//    }
//
//    @Override
//    public <S extends Song> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Song> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Song> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Song, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends Song> List<S> saveAll(Iterable<S> entities) {
//        List<S> result = new ArrayList<>();
//        for (S entity : entities) {
//            result.add((S) new Song(entity.getTrackId(), entity.getTitle(), entity.getGenre(), entity.getReleaseYear(), entity.getAlbum()));
//
//        }
//        return result;
//    }
//
//    @Override
//    public List<Song> findAll() {
//        return songList;
//    }
//
//    @Override
//    public List<Song> findAllById(Iterable<Long> id) {
//       return songList.stream().filter(ID -> ID.getId().equals(id)).collect(Collectors.toList());
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        songList.removeIf(song -> song.getId().equals(id));
//    }
//
//    @Override
//    public void delete(Song song) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Song> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<Song> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Song> findAll(Pageable pageable) {
//        return null;
//    }
//}
