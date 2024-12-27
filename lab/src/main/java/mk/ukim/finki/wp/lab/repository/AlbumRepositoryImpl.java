//package mk.ukim.finki.wp.lab.repository;
//
//import mk.ukim.finki.wp.lab.model.Album;
//import mk.ukim.finki.wp.lab.modelHolder.AlbumHolder;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//@Repository
//public class AlbumRepositoryImpl implements AlbumRepository {
//
//    @Override
//    public <S extends Album> S save(S entity) {
//        AlbumHolder.albumList.removeIf(alb -> alb.equals(entity));
//        AlbumHolder.albumList.add(entity);
//        return entity;
//    }
//
//    @Override
//    public <S extends Album> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Album> findById(Long aLong) {
//        return AlbumHolder.albumList.stream()
//                .filter(album -> album.getId().equals(aLong))
//                .findFirst();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<Album> findAll() {
//        return AlbumHolder.albumList;
//    }
//
//    @Override
//    public List<Album> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Album entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Album> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Album> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Album> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Album> entities) {
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
//    public Album getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Album getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Album getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Album> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Album> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Album> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Album> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Album> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Album> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Album, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public List<Album> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Album> findAll(Pageable pageable) {
//        return null;
//    }
//}
